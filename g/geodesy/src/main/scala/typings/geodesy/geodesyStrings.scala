package typings.geodesy

import typings.geodesy.mod.Format
import typings.geodesy.utmMod.Hemisphere
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object geodesyStrings {
  @js.native
  sealed trait N extends Hemisphere
  
  @js.native
  sealed trait S extends Hemisphere
  
  @js.native
  sealed trait d extends Format
  
  @js.native
  sealed trait dm extends Format
  
  @js.native
  sealed trait dms extends Format
  
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  @scala.inline
  def d: d = "d".asInstanceOf[d]
  @scala.inline
  def dm: dm = "dm".asInstanceOf[dm]
  @scala.inline
  def dms: dms = "dms".asInstanceOf[dms]
}

