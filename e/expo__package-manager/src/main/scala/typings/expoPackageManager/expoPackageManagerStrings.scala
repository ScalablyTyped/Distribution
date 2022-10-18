package typings.expoPackageManager

import typings.expoPackageManager.buildCocoaPodsPackageManagerMod.CocoaPodsErrorCode
import typings.expoPackageManager.buildNodePackageManagersMod.NodePackageManager
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
  
  @js.native
  sealed trait npm
    extends StObject
       with NodePackageManager
  inline def npm: npm = "npm".asInstanceOf[npm]
  
  @js.native
  sealed trait pnpm
    extends StObject
       with NodePackageManager
  inline def pnpm: pnpm = "pnpm".asInstanceOf[pnpm]
  
  @js.native
  sealed trait yarn
    extends StObject
       with NodePackageManager
  inline def yarn: yarn = "yarn".asInstanceOf[yarn]
}
