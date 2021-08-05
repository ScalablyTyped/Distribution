package typings.execa

import typings.execa.mod._StdioOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object execaStrings {
  
  @js.native
  sealed trait advanced extends StObject
  inline def advanced: advanced = "advanced".asInstanceOf[advanced]
  
  @js.native
  sealed trait ignore
    extends StObject
       with _StdioOption
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait inherit
    extends StObject
       with _StdioOption
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait ipc
    extends StObject
       with _StdioOption
  inline def ipc: ipc = "ipc".asInstanceOf[ipc]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait pipe
    extends StObject
       with _StdioOption
  inline def pipe: pipe = "pipe".asInstanceOf[pipe]
}
