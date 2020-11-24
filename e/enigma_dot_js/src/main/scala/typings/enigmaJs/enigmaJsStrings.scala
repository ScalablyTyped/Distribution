package typings.enigmaJs

import typings.enigmaJs.enigmaJS._MixinType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enigmaJsStrings {
  
  @scala.inline
  def Doc: Doc = "Doc".asInstanceOf[Doc]
  
  @scala.inline
  def GenericBookmark: GenericBookmark = "GenericBookmark".asInstanceOf[GenericBookmark]
  
  @scala.inline
  def GenericObject: GenericObject = "GenericObject".asInstanceOf[GenericObject]
  
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @scala.inline
  def opened: opened = "opened".asInstanceOf[opened]
  
  @scala.inline
  def resumed: resumed = "resumed".asInstanceOf[resumed]
  
  @scala.inline
  def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait Doc extends _MixinType
  
  @js.native
  sealed trait GenericBookmark extends _MixinType
  
  @js.native
  sealed trait GenericObject extends _MixinType
  
  @js.native
  sealed trait changed extends js.Object
  
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait opened extends js.Object
  
  @js.native
  sealed trait resumed extends js.Object
  
  @js.native
  sealed trait suspended extends js.Object
}
