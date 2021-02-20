package typings.geodesy

import typings.geodesy.mod.Format
import typings.geodesy.utmMod.Hemisphere
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geodesyStrings {
  
  @js.native
  sealed trait N extends Hemisphere
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  
  @js.native
  sealed trait S extends Hemisphere
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait d extends Format
  @scala.inline
  def d: d = "d".asInstanceOf[d]
  
  @js.native
  sealed trait dm extends Format
  @scala.inline
  def dm: dm = "dm".asInstanceOf[dm]
  
  @js.native
  sealed trait dms extends Format
  @scala.inline
  def dms: dms = "dms".asInstanceOf[dms]
}
