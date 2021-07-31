package typings.domutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DecodeEntities extends StObject {
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeEntities {
    
    @scala.inline
    def apply(): DecodeEntities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeEntities]
    }
    
    @scala.inline
    implicit class DecodeEntitiesMutableBuilder[Self <: DecodeEntities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      @scala.inline
      def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
}
