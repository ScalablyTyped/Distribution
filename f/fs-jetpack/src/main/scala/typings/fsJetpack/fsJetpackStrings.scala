package typings.fsJetpack

import typings.fsJetpack.typesMod.Checksum
import typings.fsJetpack.typesMod.ExistsResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsJetpackStrings {
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def follow: follow = "follow".asInstanceOf[follow]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def jsonWithDates: jsonWithDates = "jsonWithDates".asInstanceOf[jsonWithDates]
  
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @scala.inline
  def report: report = "report".asInstanceOf[report]
  
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @scala.inline
  def symlink: symlink = "symlink".asInstanceOf[symlink]
  
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait dir extends ExistsResult
  
  @js.native
  sealed trait file extends ExistsResult
  
  @js.native
  sealed trait follow extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait jsonWithDates extends js.Object
  
  @js.native
  sealed trait md5 extends Checksum
  
  @js.native
  sealed trait other extends ExistsResult
  
  @js.native
  sealed trait report extends js.Object
  
  @js.native
  sealed trait sha1 extends Checksum
  
  @js.native
  sealed trait sha256 extends Checksum
  
  @js.native
  sealed trait sha512 extends Checksum
  
  @js.native
  sealed trait symlink extends js.Object
  
  @js.native
  sealed trait utf8 extends js.Object
}
