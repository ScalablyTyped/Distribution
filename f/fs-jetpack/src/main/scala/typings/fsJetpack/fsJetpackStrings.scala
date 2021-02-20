package typings.fsJetpack

import typings.fsJetpack.typesMod.Checksum
import typings.fsJetpack.typesMod.ExistsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsJetpackStrings {
  
  @js.native
  sealed trait buffer extends StObject
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait dir extends ExistsResult
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait file extends ExistsResult
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait follow extends StObject
  @scala.inline
  def follow: follow = "follow".asInstanceOf[follow]
  
  @js.native
  sealed trait json extends StObject
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait jsonWithDates extends StObject
  @scala.inline
  def jsonWithDates: jsonWithDates = "jsonWithDates".asInstanceOf[jsonWithDates]
  
  @js.native
  sealed trait md5 extends Checksum
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait other extends ExistsResult
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait report extends StObject
  @scala.inline
  def report: report = "report".asInstanceOf[report]
  
  @js.native
  sealed trait sha1 extends Checksum
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256 extends Checksum
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha512 extends Checksum
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait symlink extends StObject
  @scala.inline
  def symlink: symlink = "symlink".asInstanceOf[symlink]
  
  @js.native
  sealed trait utf8 extends StObject
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
