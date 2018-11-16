package typings
package fseventsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fseventsLibStrings {
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait created extends js.Object
  
  @js.native
  sealed trait deleted extends js.Object
  
  @js.native
  sealed trait directory extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait fsevent extends js.Object
  
  @js.native
  sealed trait modified extends js.Object
  
  @js.native
  sealed trait moved extends js.Object
  
  @js.native
  sealed trait `moved-in` extends js.Object
  
  @js.native
  sealed trait `moved-out` extends js.Object
  
  @js.native
  sealed trait `root-changed` extends js.Object
  
  @js.native
  sealed trait symlink extends js.Object
  
  @js.native
  sealed trait unknown extends js.Object
  
  def change: change = "change".asInstanceOf[change]
  def created: created = "created".asInstanceOf[created]
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  def directory: directory = "directory".asInstanceOf[directory]
  def file: file = "file".asInstanceOf[file]
  def fsevent: fsevent = "fsevent".asInstanceOf[fsevent]
  def modified: modified = "modified".asInstanceOf[modified]
  def moved: moved = "moved".asInstanceOf[moved]
  def `moved-in`: `moved-in` = "moved-in".asInstanceOf[`moved-in`]
  def `moved-out`: `moved-out` = "moved-out".asInstanceOf[`moved-out`]
  def `root-changed`: `root-changed` = "root-changed".asInstanceOf[`root-changed`]
  def symlink: symlink = "symlink".asInstanceOf[symlink]
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

