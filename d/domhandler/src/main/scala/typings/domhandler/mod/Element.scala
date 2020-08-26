package typings.domhandler.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "Element")
@js.native
class Element protected ()
  extends typings.domhandler.nodeMod.Element {
  /**
    *
    * @param name Name of the tag, eg. `div`, `span`
    * @param attribs Object mapping attribute names to attribute values
    */
  def this(name: String, attribs: StringDictionary[String]) = this()
}

