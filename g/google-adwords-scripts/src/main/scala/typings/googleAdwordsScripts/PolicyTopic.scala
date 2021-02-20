package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTopic extends StObject {
  
  def getId(): String = js.native
  
  def getName(): String = js.native
  
  def getType(): String = js.native
}
object PolicyTopic {
  
  @scala.inline
  def apply(getId: () => String, getName: () => String, getType: () => String): PolicyTopic = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[PolicyTopic]
  }
  
  @scala.inline
  implicit class PolicyTopicMutableBuilder[Self <: PolicyTopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
  }
}
