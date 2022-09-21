package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a field in the document.
  */
@JSGlobal("Field")
@js.native
open class Field ()
  extends StObject
     with typings.devexpressWeb.Field {
  
  /**
    * Gets the text buffer interval occupied by the field code element.
    */
  /* CompleteClass */
  override val codeInterval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Gets or sets the name of a bookmark (or a hyperlink) in the current document which shall be the target of the hyperlink field.
    */
  /* CompleteClass */
  override val hyperlinkAnchor: String = js.native
  
  /**
    * Gets or sets the text for the tooltip displayed when the mouse hovers over a hyperlink field.
    */
  /* CompleteClass */
  override val hyperlinkTip: String = js.native
  
  /**
    * Gets or sets a URI to navigate to when the hyperlink (represented by the current field) is activated.
    */
  /* CompleteClass */
  override val hyperlinkUri: String = js.native
  
  /**
    * Gets the index of the field
    */
  /* CompleteClass */
  override val index: Double = js.native
  
  /**
    * Gets the text buffer interval occupied by the current field element.
    */
  /* CompleteClass */
  override val interval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Returns a value specifying whether the field is a hyperlink.
    */
  /* CompleteClass */
  override val isHyperlink: Boolean = js.native
  
  /**
    * Gets the field length in a document.
    */
  /* CompleteClass */
  override val length: Double = js.native
  
  /**
    * Gets the text buffer interval occupied by the field result element.
    */
  /* CompleteClass */
  override val resultInterval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Gets a value specifying whether a field's code or result is dispalyed.
    */
  /* CompleteClass */
  override val showCode: Boolean = js.native
  
  /**
    * Gets the field's start position in a document.
    */
  /* CompleteClass */
  override val start: Double = js.native
}
