package typings.geodesy

import typings.geodesy.geodesyMod.datum
import typings.geodesy.geodesyMod.ellipsoid
import typings.geodesy.geodesyMod.format
import typings.geodesy.geodesyMod.hemisphere
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object geodesyStrings {
  @js.native
  sealed trait Airy1830 extends ellipsoid
  
  @js.native
  sealed trait AiryModified extends ellipsoid
  
  @js.native
  sealed trait Bessel1841 extends ellipsoid
  
  @js.native
  sealed trait Clarke1866 extends ellipsoid
  
  @js.native
  sealed trait Clarke1880IGN extends ellipsoid
  
  @js.native
  sealed trait ED50 extends datum
  
  @js.native
  sealed trait GRS80 extends ellipsoid
  
  @js.native
  sealed trait Intl1924 extends ellipsoid
  
  @js.native
  sealed trait Irl1975 extends datum
  
  @js.native
  sealed trait N extends hemisphere
  
  @js.native
  sealed trait NAD27 extends datum
  
  @js.native
  sealed trait NAD83 extends datum
  
  @js.native
  sealed trait NTF extends datum
  
  @js.native
  sealed trait OSGB36 extends datum
  
  @js.native
  sealed trait Potsdam extends datum
  
  @js.native
  sealed trait S extends hemisphere
  
  @js.native
  sealed trait TokyoJapan extends datum
  
  @js.native
  sealed trait WGS72
    extends datum
       with ellipsoid
  
  @js.native
  sealed trait WGS84
    extends datum
       with ellipsoid
  
  @js.native
  sealed trait d extends format
  
  @js.native
  sealed trait dm extends format
  
  @js.native
  sealed trait dms extends format
  
  @scala.inline
  def Airy1830: Airy1830 = "Airy1830".asInstanceOf[Airy1830]
  @scala.inline
  def AiryModified: AiryModified = "AiryModified".asInstanceOf[AiryModified]
  @scala.inline
  def Bessel1841: Bessel1841 = "Bessel1841".asInstanceOf[Bessel1841]
  @scala.inline
  def Clarke1866: Clarke1866 = "Clarke1866".asInstanceOf[Clarke1866]
  @scala.inline
  def Clarke1880IGN: Clarke1880IGN = "Clarke1880IGN".asInstanceOf[Clarke1880IGN]
  @scala.inline
  def ED50: ED50 = "ED50".asInstanceOf[ED50]
  @scala.inline
  def GRS80: GRS80 = "GRS80".asInstanceOf[GRS80]
  @scala.inline
  def Intl1924: Intl1924 = "Intl1924".asInstanceOf[Intl1924]
  @scala.inline
  def Irl1975: Irl1975 = "Irl1975".asInstanceOf[Irl1975]
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  @scala.inline
  def NAD27: NAD27 = "NAD27".asInstanceOf[NAD27]
  @scala.inline
  def NAD83: NAD83 = "NAD83".asInstanceOf[NAD83]
  @scala.inline
  def NTF: NTF = "NTF".asInstanceOf[NTF]
  @scala.inline
  def OSGB36: OSGB36 = "OSGB36".asInstanceOf[OSGB36]
  @scala.inline
  def Potsdam: Potsdam = "Potsdam".asInstanceOf[Potsdam]
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  @scala.inline
  def TokyoJapan: TokyoJapan = "TokyoJapan".asInstanceOf[TokyoJapan]
  @scala.inline
  def WGS72: WGS72 = "WGS72".asInstanceOf[WGS72]
  @scala.inline
  def WGS84: WGS84 = "WGS84".asInstanceOf[WGS84]
  @scala.inline
  def d: d = "d".asInstanceOf[d]
  @scala.inline
  def dm: dm = "dm".asInstanceOf[dm]
  @scala.inline
  def dms: dms = "dms".asInstanceOf[dms]
}

