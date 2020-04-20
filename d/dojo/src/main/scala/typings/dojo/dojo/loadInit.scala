package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/loadInit.html
  *
  *
  */
trait loadInit extends js.Object {
  /**
    *
    */
  var dynamic: Double
  /**
    *
    */
  var load: js.Object
  /**
    *
    * @param id
    */
  def normalize(id: js.Any): js.Any
}

object loadInit {
  @scala.inline
  def apply(dynamic: Double, load: js.Object, normalize: js.Any => js.Any): loadInit = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], normalize = js.Any.fromFunction1(normalize))
    __obj.asInstanceOf[loadInit]
  }
}

