package typings.expoPackageManager

import typings.expoPackageManager.buildIosCocoaPodsPackageManagerMod.CocoaPodsErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoPackageManagerStrings {
  
  @js.native
  sealed trait COMMAND_FAILED
    extends StObject
       with CocoaPodsErrorCode
  inline def COMMAND_FAILED: COMMAND_FAILED = "COMMAND_FAILED".asInstanceOf[COMMAND_FAILED]
  
  @js.native
  sealed trait NON_INTERACTIVE
    extends StObject
       with CocoaPodsErrorCode
  inline def NON_INTERACTIVE: NON_INTERACTIVE = "NON_INTERACTIVE".asInstanceOf[NON_INTERACTIVE]
  
  @js.native
  sealed trait NO_CLI
    extends StObject
       with CocoaPodsErrorCode
  inline def NO_CLI: NO_CLI = "NO_CLI".asInstanceOf[NO_CLI]
}
