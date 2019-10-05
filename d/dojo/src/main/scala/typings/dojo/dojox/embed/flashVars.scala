package typings.dojo.dojox.embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/embed/flashVars.html
  *
  * Handles flashvar serialization
  * Converting complex objects into a simple, clear string that can be appended
  * to the swf as a query: myMovie.swf?flashvars=foo.
  * Note this needs to work with the SWF, which must know what variables to expect.
  * Therefore this is something of an "internal" class - unless you know how to
  * modify or create SWFs.
  * JSON could be done, but Deft does not yet have a JSON parser, and quotes are
  * very problematic since Flash cannot use eval(); JSON parsing was successful
  * when it was fully escaped, but that made it very large anyway. flashvar
  * serialization at most is 200% larger than JSON.
  *
  */
trait flashVars extends js.Object {
  /**
    * Deft/common/flashVars.as
    *
    */
  var See: js.Object
  /**
    * Key method. Serializes an object.
    *
    * @param n The name for the object, such as: "button"
    * @param o The object to serialize
    */
  def serialize(n: String, o: js.Object): js.Any
}

object flashVars {
  @scala.inline
  def apply(See: js.Object, serialize: (String, js.Object) => js.Any): flashVars = {
    val __obj = js.Dynamic.literal(See = See, serialize = js.Any.fromFunction2(serialize))
  
    __obj.asInstanceOf[flashVars]
  }
}

