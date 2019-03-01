package typings
package fsDashExtraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fsDashExtraLibStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait dir
    extends fsDashExtraLib.fsDashExtraMod.FsSymlinkType
       with fsDashExtraLib.fsDashExtraMod.SymlinkType
  
  @js.native
  sealed trait file
    extends fsDashExtraLib.fsDashExtraMod.FsSymlinkType
       with fsDashExtraLib.fsDashExtraMod.SymlinkType
  
  @js.native
  sealed trait junction
    extends fsDashExtraLib.fsDashExtraMod.FsSymlinkType
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def junction: junction = "junction".asInstanceOf[junction]
}

