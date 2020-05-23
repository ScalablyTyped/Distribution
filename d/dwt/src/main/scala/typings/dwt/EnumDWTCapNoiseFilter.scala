package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapNoiseFilter extends js.Object

/** ICAP_NOISEFILTER values. */
@JSGlobal("EnumDWT_CapNoiseFilter")
@js.native
object EnumDWTCapNoiseFilter extends js.Object {
  @js.native
  sealed trait TWNF_AUTO extends EnumDWTCapNoiseFilter
  
  @js.native
  sealed trait TWNF_LONEPIXEL extends EnumDWTCapNoiseFilter
  
  @js.native
  sealed trait TWNF_MAJORITYRULE extends EnumDWTCapNoiseFilter
  
  @js.native
  sealed trait TWNF_NONE extends EnumDWTCapNoiseFilter
  
}

