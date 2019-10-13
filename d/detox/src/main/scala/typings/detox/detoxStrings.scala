package typings.detox

import typings.detox.detoxMod._Global_.Detox.Direction
import typings.detox.detoxMod._Global_.Detox.LocationPermission
import typings.detox.detoxMod._Global_.Detox.Orientation
import typings.detox.detoxMod._Global_.Detox.PermissionState
import typings.detox.detoxMod._Global_.Detox.Speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object detoxStrings {
  @js.native
  sealed trait NO extends PermissionState
  
  @js.native
  sealed trait YES extends PermissionState
  
  @js.native
  sealed trait always extends LocationPermission
  
  @js.native
  sealed trait android extends js.Object
  
  @js.native
  sealed trait bottom extends Direction
  
  @js.native
  sealed trait down extends Direction
  
  @js.native
  sealed trait fast extends Speed
  
  @js.native
  sealed trait inuse extends LocationPermission
  
  @js.native
  sealed trait ios extends js.Object
  
  @js.native
  sealed trait landscape extends Orientation
  
  @js.native
  sealed trait left extends Direction
  
  @js.native
  sealed trait never extends LocationPermission
  
  @js.native
  sealed trait portrait extends Orientation
  
  @js.native
  sealed trait right extends Direction
  
  @js.native
  sealed trait slow extends Speed
  
  @js.native
  sealed trait top extends Direction
  
  @js.native
  sealed trait unset
    extends LocationPermission
       with PermissionState
  
  @js.native
  sealed trait up extends Direction
  
  @scala.inline
  def NO: NO = "NO".asInstanceOf[NO]
  @scala.inline
  def YES: YES = "YES".asInstanceOf[YES]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  @scala.inline
  def inuse: inuse = "inuse".asInstanceOf[inuse]
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def unset: unset = "unset".asInstanceOf[unset]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}

