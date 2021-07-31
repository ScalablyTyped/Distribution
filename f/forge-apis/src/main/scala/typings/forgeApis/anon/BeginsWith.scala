package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginsWith extends StObject {
  
  var beginsWith: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var startAt: js.UndefOr[String] = js.undefined
}
object BeginsWith {
  
  @scala.inline
  def apply(): BeginsWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginsWith]
  }
  
  @scala.inline
  implicit class BeginsWithMutableBuilder[Self <: BeginsWith] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginsWithUndefined: Self = StObject.set(x, "beginsWith", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
  }
}
