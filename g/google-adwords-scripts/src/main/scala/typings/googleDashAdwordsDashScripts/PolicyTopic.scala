package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTopic extends js.Object {
  def getId(): String
  def getName(): String
  def getType(): String
}

object PolicyTopic {
  @scala.inline
  def apply(getId: () => String, getName: () => String, getType: () => String): PolicyTopic = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[PolicyTopic]
  }
}

