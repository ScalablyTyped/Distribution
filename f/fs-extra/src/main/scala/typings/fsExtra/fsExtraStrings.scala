package typings.fsExtra

import typings.fsExtra.mod.SymlinkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsExtraStrings {
  
  @js.native
  sealed trait buffer extends StObject
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait dir
    extends StObject
       with SymlinkType
  inline def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait file
    extends StObject
       with SymlinkType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait junction
    extends StObject
       with SymlinkType
  inline def junction: junction = "junction".asInstanceOf[junction]
}
