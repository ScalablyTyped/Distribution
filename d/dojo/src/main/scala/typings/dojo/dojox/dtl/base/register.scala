package typings.dojo.dojox.dtl.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.register.html
  *
  * A register for filters and tags.
  *
  */
trait register extends js.Object {
  /**
    * Register the specified filter libraries.
    * The locations parameter defines the contents of each library as a hash whose keys are the library names and values
    * an array of the filters exported by the library. For example, the filters exported by the date library would be:
    *
    * { "dates": ["date", "time", "timesince", "timeuntil"] }
    *
    * @param base The base path of the libraries.
    * @param locations An object defining the filters for each library as a hash whose keys are the library names and values an array of the filters exported by the library.
    */
  def filters(base: String, locations: js.Object): Unit
  /**
    * Register the specified tag libraries.
    * The locations parameter defines the contents of each library as a hash whose keys are the library names and values
    * an array of the tags exported by the library. For example, the tags exported by the logic library would be:
    *
    * { logic: ["if", "for", "ifequal", "ifnotequal"] }
    *
    * @param base The base path of the libraries.
    * @param locations An object defining the tags for each library as a hash whose keys are the library names and values an array of the tags or filters exported by the library.
    */
  def tags(base: String, locations: js.Object): Unit
}

object register {
  @scala.inline
  def apply(filters: (String, js.Object) => Unit, tags: (String, js.Object) => Unit): register = {
    val __obj = js.Dynamic.literal(filters = js.Any.fromFunction2(filters), tags = js.Any.fromFunction2(tags))
  
    __obj.asInstanceOf[register]
  }
}

