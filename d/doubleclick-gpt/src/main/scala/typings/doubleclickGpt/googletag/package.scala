package typings.doubleclickGpt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object googletag {
  
  type GeneralSize = typings.doubleclickGpt.googletag.SingleSize | typings.doubleclickGpt.googletag.MultiSize
  
  type MultiSize = js.Array[typings.doubleclickGpt.googletag.SingleSize]
  
  type NamedSize = java.lang.String | js.Array[java.lang.String]
  
  type SingleSize = typings.doubleclickGpt.googletag.SingleSizeArray | typings.doubleclickGpt.googletag.NamedSize
  
  type SingleSizeArray = js.Array[scala.Double]
  
  type SizeMapping = js.Array[typings.doubleclickGpt.googletag.GeneralSize]
  
  type SizeMappingArray = js.Array[typings.doubleclickGpt.googletag.SizeMapping]
}
