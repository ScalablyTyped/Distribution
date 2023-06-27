package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Print
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Print: Model = js.native
  
  /** Print the specific page or an element.
    * @returns {void}
    */
  def print(): Unit = js.native
}
object Print {
  
  trait BeforeStartEventArgs extends StObject {
    
    /** Set this option as true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the printed element
      */
    var content: js.UndefOr[Any] = js.undefined
    
    /** Returns the Print model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of an event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeStartEventArgs {
    
    inline def apply(): BeforeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Append the custom HTML after the selected content.
      * @default {null}
      */
    var append: js.UndefOr[String] = js.undefined
    
    /** Event triggers before the document page or an element in it gets printed.
      */
    var beforeStart: js.UndefOr[js.Function1[/* e */ BeforeStartEventArgs, Unit]] = js.undefined
    
    /** Prepend a docType to the document frame.
      * @default {&lt;!doctype html&gt;}
      */
    var docType: js.UndefOr[String] = js.undefined
    
    /** A selector that specifies a particular element to be excluded from printing.
      * @default {null}
      */
    var excludeSelector: js.UndefOr[String] = js.undefined
    
    /** Specifies whether the URL of an external stylesheet can be included to customize and print that page.
      * @default {null}
      */
    var externalStyles: js.UndefOr[String] = js.undefined
    
    /** Specifies whether the global styles can be applied to the element to be printed.
      * @default {true}
      */
    var globalStyles: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the height of the print window.
      * @default {454}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Prepends the custom HTML before the selected content.
      * @default {null}
      */
    var prepend: js.UndefOr[String] = js.undefined
    
    /** Allows printing the content in a new window.
      * @default {false}
      */
    var printInNewWindow: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the period of time to wait before printing the content.
      * @default {1000}
      */
    var timeOutPeriod: js.UndefOr[Double] = js.undefined
    
    /** Sets the title of the print document.
      * @default {null}
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** Defines the width of the print window.
      * @default {1024}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Print.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Print.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Print.Model] (val x: Self) extends AnyVal {
      
      inline def setAppend(value: String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setBeforeStart(value: /* e */ BeforeStartEventArgs => Unit): Self = StObject.set(x, "beforeStart", js.Any.fromFunction1(value))
      
      inline def setBeforeStartUndefined: Self = StObject.set(x, "beforeStart", js.undefined)
      
      inline def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
      
      inline def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
      
      inline def setExcludeSelector(value: String): Self = StObject.set(x, "excludeSelector", value.asInstanceOf[js.Any])
      
      inline def setExcludeSelectorUndefined: Self = StObject.set(x, "excludeSelector", js.undefined)
      
      inline def setExternalStyles(value: String): Self = StObject.set(x, "externalStyles", value.asInstanceOf[js.Any])
      
      inline def setExternalStylesUndefined: Self = StObject.set(x, "externalStyles", js.undefined)
      
      inline def setGlobalStyles(value: Boolean): Self = StObject.set(x, "globalStyles", value.asInstanceOf[js.Any])
      
      inline def setGlobalStylesUndefined: Self = StObject.set(x, "globalStyles", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPrepend(value: String): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setPrintInNewWindow(value: Boolean): Self = StObject.set(x, "printInNewWindow", value.asInstanceOf[js.Any])
      
      inline def setPrintInNewWindowUndefined: Self = StObject.set(x, "printInNewWindow", js.undefined)
      
      inline def setTimeOutPeriod(value: Double): Self = StObject.set(x, "timeOutPeriod", value.asInstanceOf[js.Any])
      
      inline def setTimeOutPeriodUndefined: Self = StObject.set(x, "timeOutPeriod", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
