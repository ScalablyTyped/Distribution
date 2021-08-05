package typings.enigmaJs

import typings.enigmaJs.enigmaJS._MixinType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enigmaJsStrings {
  
  @js.native
  sealed trait Doc
    extends StObject
       with _MixinType
  inline def Doc: Doc = "Doc".asInstanceOf[Doc]
  
  @js.native
  sealed trait GenericBookmark
    extends StObject
       with _MixinType
  inline def GenericBookmark: GenericBookmark = "GenericBookmark".asInstanceOf[GenericBookmark]
  
  @js.native
  sealed trait GenericObject
    extends StObject
       with _MixinType
  inline def GenericObject: GenericObject = "GenericObject".asInstanceOf[GenericObject]
  
  @js.native
  sealed trait changed extends StObject
  inline def changed: changed = "changed".asInstanceOf[changed]
  
  @js.native
  sealed trait closed extends StObject
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait opened extends StObject
  inline def opened: opened = "opened".asInstanceOf[opened]
  
  @js.native
  sealed trait resumed extends StObject
  inline def resumed: resumed = "resumed".asInstanceOf[resumed]
  
  @js.native
  sealed trait suspended extends StObject
  inline def suspended: suspended = "suspended".asInstanceOf[suspended]
}
