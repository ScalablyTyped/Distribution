package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define a hyperlink.
  */
@JSGlobal("HyperlinkSettings")
@js.native
/**
  * Initializes a new instance of the HyperlinkSettings object.
  * @param url A hyperlink URL.
  * @param bookmark A bookmark name.
  * @param tooltip A tooltip text.
  * @param text A hyperlink text.
  */
class HyperlinkSettings ()
  extends StObject
     with typings.devexpressWeb.HyperlinkSettings {
  def this(url: String) = this()
  def this(url: String, bookmark: String) = this()
  def this(url: Unit, bookmark: String) = this()
  def this(url: String, bookmark: String, tooltip: String) = this()
  def this(url: String, bookmark: Unit, tooltip: String) = this()
  def this(url: Unit, bookmark: String, tooltip: String) = this()
  def this(url: Unit, bookmark: Unit, tooltip: String) = this()
  def this(url: String, bookmark: String, tooltip: String, text: String) = this()
  def this(url: String, bookmark: String, tooltip: Unit, text: String) = this()
  def this(url: String, bookmark: Unit, tooltip: String, text: String) = this()
  def this(url: String, bookmark: Unit, tooltip: Unit, text: String) = this()
  def this(url: Unit, bookmark: String, tooltip: String, text: String) = this()
  def this(url: Unit, bookmark: String, tooltip: Unit, text: String) = this()
  def this(url: Unit, bookmark: Unit, tooltip: String, text: String) = this()
  def this(url: Unit, bookmark: Unit, tooltip: Unit, text: String) = this()
  
  /**
    * Specifies a hyperlink's bookmark.
    */
  /* CompleteClass */
  var bookmark: String = js.native
  
  /**
    * Specifies a hyperlink text.
    */
  /* CompleteClass */
  var text: String = js.native
  
  /**
    * Specifies a tooltip text.
    */
  /* CompleteClass */
  var tooltip: String = js.native
  
  /**
    * Specifies a hyperlink's destination.
    */
  /* CompleteClass */
  var url: String = js.native
}
