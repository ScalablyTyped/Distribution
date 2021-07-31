package typings.detox

import typings.detox.mod.global.Detox_.Direction
import typings.detox.mod.global.Detox_.LocationPermission
import typings.detox.mod.global.Detox_.Orientation
import typings.detox.mod.global.Detox_.PermissionState
import typings.detox.mod.global.Detox_.Speed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detoxStrings {
  
  @js.native
  sealed trait NO
    extends StObject
       with PermissionState
  @scala.inline
  def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait YES
    extends StObject
       with PermissionState
  @scala.inline
  def YES: YES = "YES".asInstanceOf[YES]
  
  @js.native
  sealed trait always
    extends StObject
       with LocationPermission
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait android extends StObject
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait bottom
    extends StObject
       with Direction
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait down
    extends StObject
       with Direction
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait fast
    extends StObject
       with Speed
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  
  @js.native
  sealed trait inuse
    extends StObject
       with LocationPermission
  @scala.inline
  def inuse: inuse = "inuse".asInstanceOf[inuse]
  
  @js.native
  sealed trait ios extends StObject
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait landscape
    extends StObject
       with Orientation
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait left
    extends StObject
       with Direction
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait never
    extends StObject
       with LocationPermission
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait portrait
    extends StObject
       with Orientation
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait right
    extends StObject
       with Direction
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait slow
    extends StObject
       with Speed
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
  
  @js.native
  sealed trait top
    extends StObject
       with Direction
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait unset
    extends StObject
       with LocationPermission
       with PermissionState
  @scala.inline
  def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait up
    extends StObject
       with Direction
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}
