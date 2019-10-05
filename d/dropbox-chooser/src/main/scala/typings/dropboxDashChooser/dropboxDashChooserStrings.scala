package typings.dropboxDashChooser

import typings.dropboxDashChooser.Dropbox.ChooserFileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dropboxDashChooserStrings {
  @js.native
  sealed trait crop extends ChooserFileMode
  
  @js.native
  sealed trait direct extends js.Object
  
  @js.native
  sealed trait fit extends ChooserFileMode
  
  @js.native
  sealed trait fit_one_and_overflow extends ChooserFileMode
  
  @js.native
  sealed trait preview extends js.Object
  
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  @scala.inline
  def direct: direct = "direct".asInstanceOf[direct]
  @scala.inline
  def fit: fit = "fit".asInstanceOf[fit]
  @scala.inline
  def fit_one_and_overflow: fit_one_and_overflow = "fit_one_and_overflow".asInstanceOf[fit_one_and_overflow]
  @scala.inline
  def preview: preview = "preview".asInstanceOf[preview]
}

