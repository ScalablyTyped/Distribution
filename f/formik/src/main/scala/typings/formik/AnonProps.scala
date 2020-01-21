package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps[P] extends js.Object {
  var props: P
}

object AnonProps {
  @scala.inline
  def apply[P](props: P): AnonProps[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProps[P]]
  }
}

