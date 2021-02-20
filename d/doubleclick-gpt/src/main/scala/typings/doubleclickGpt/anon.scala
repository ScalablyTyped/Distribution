package typings.doubleclickGpt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ChangeCorrelator extends StObject {
    
    var changeCorrelator: Boolean = js.native
  }
  object ChangeCorrelator {
    
    @scala.inline
    def apply(changeCorrelator: Boolean): ChangeCorrelator = {
      val __obj = js.Dynamic.literal(changeCorrelator = changeCorrelator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeCorrelator]
    }
    
    @scala.inline
    implicit class ChangeCorrelatorMutableBuilder[Self <: ChangeCorrelator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeCorrelator(value: Boolean): Self = StObject.set(x, "changeCorrelator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RestrictDataProcessing extends StObject {
    
    var restrictDataProcessing: Boolean = js.native
  }
  object RestrictDataProcessing {
    
    @scala.inline
    def apply(restrictDataProcessing: Boolean): RestrictDataProcessing = {
      val __obj = js.Dynamic.literal(restrictDataProcessing = restrictDataProcessing.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictDataProcessing]
    }
    
    @scala.inline
    implicit class RestrictDataProcessingMutableBuilder[Self <: RestrictDataProcessing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestrictDataProcessing(value: Boolean): Self = StObject.set(x, "restrictDataProcessing", value.asInstanceOf[js.Any])
    }
  }
}
