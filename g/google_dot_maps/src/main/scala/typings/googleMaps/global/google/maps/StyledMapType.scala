package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MapTypeStyle
import typings.googleMaps.google.maps.StyledMapTypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a <code>MapType</code> with a custom style.
  */
@JSGlobal("google.maps.StyledMapType")
@js.native
/**
  * Creates a <code>MapType</code> with a custom style.
  */
open class StyledMapType ()
  extends StObject
     with typings.googleMaps.google.maps.StyledMapType {
  def this(styles: js.Array[MapTypeStyle | Null]) = this()
  def this(styles: js.Array[MapTypeStyle | Null], options: StyledMapTypeOptions) = this()
  def this(styles: Null, options: StyledMapTypeOptions) = this()
}
