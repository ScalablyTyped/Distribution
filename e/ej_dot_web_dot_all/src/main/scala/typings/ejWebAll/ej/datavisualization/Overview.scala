package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overview
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Overview: Model = js.native
}
object Overview {
  
  trait Model extends StObject {
    
    /** Defines the height of the overview
      * @Default {400}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** The sourceId property of overview should be set with the corresponding Diagram ID for you need the overall view.
      * @Default {null}
      */
    var sourceID: js.UndefOr[String] = js.undefined
    
    /** Defines the width of the overview
      * @Default {250}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.Overview.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.Overview.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.Overview.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSourceID(value: String): Self = StObject.set(x, "sourceID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIDUndefined: Self = StObject.set(x, "sourceID", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
