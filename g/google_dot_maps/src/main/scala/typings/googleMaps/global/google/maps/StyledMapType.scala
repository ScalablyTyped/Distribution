package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MapTypeStyle
import typings.googleMaps.google.maps.StyledMapTypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.StyledMapType")
@js.native
/**
  * Creates a <code>MapType</code> with a custom style.
  *
  * Access by calling `const {StyledMapType} = await
  * google.maps.importLibrary("maps")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class StyledMapType ()
  extends StObject
     with typings.googleMaps.google.maps.StyledMapType {
  def this(styles: js.Array[MapTypeStyle | Null]) = this()
  def this(styles: js.Array[MapTypeStyle | Null], options: StyledMapTypeOptions) = this()
  def this(styles: Null, options: StyledMapTypeOptions) = this()
}
