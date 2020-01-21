package typings.gdal

import typings.gdal.mod.Resampling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gdalStrings {
  @js.native
  sealed trait AVERAGE extends Resampling
  
  @js.native
  sealed trait AVERAGE_MAGPHASE extends Resampling
  
  @js.native
  sealed trait CUBIC extends Resampling
  
  @js.native
  sealed trait GAUSS extends Resampling
  
  @js.native
  sealed trait MODE extends Resampling
  
  @js.native
  sealed trait NEAREST extends Resampling
  
  @js.native
  sealed trait NONE extends Resampling
  
  @js.native
  sealed trait lat extends js.Object
  
  @js.native
  sealed trait long extends js.Object
  
  @js.native
  sealed trait r extends js.Object
  
  @js.native
  sealed trait rPlussign extends js.Object
  
  @js.native
  sealed trait w extends js.Object
  
  @scala.inline
  def AVERAGE: AVERAGE = "AVERAGE".asInstanceOf[AVERAGE]
  @scala.inline
  def AVERAGE_MAGPHASE: AVERAGE_MAGPHASE = "AVERAGE_MAGPHASE".asInstanceOf[AVERAGE_MAGPHASE]
  @scala.inline
  def CUBIC: CUBIC = "CUBIC".asInstanceOf[CUBIC]
  @scala.inline
  def GAUSS: GAUSS = "GAUSS".asInstanceOf[GAUSS]
  @scala.inline
  def MODE: MODE = "MODE".asInstanceOf[MODE]
  @scala.inline
  def NEAREST: NEAREST = "NEAREST".asInstanceOf[NEAREST]
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  @scala.inline
  def lat: lat = "lat".asInstanceOf[lat]
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def r: r = "r".asInstanceOf[r]
  @scala.inline
  def rPlussign: rPlussign = "r+".asInstanceOf[rPlussign]
  @scala.inline
  def w: w = "w".asInstanceOf[w]
}

