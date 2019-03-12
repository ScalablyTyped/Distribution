package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTopic extends js.Object {
  def getId(): java.lang.String
  def getName(): java.lang.String
  def getType(): java.lang.String
}

object PolicyTopic {
  @scala.inline
  def apply(getId: () => java.lang.String, getName: () => java.lang.String, getType: () => java.lang.String): PolicyTopic = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[PolicyTopic]
  }
}

