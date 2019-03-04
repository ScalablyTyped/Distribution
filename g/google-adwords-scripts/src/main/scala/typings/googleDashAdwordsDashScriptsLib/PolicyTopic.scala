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
  def apply(
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String]
  ): PolicyTopic = {
    val __obj = js.Dynamic.literal(getId = getId, getName = getName, getType = getType)
  
    __obj.asInstanceOf[PolicyTopic]
  }
}

