package typings.electronOsxSign

import typings.electronOsxSign.distCjsTypesMod.ElectronMacPlatform
import typings.electronOsxSign.distCjsTypesMod.SigningDistributionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronOsxSignStrings {
  
  @js.native
  sealed trait darwin
    extends StObject
       with ElectronMacPlatform
       with typings.electronOsxSign.distEsmTypesMod.ElectronMacPlatform
  inline def darwin: darwin = "darwin".asInstanceOf[darwin]
  
  @js.native
  sealed trait development
    extends StObject
       with SigningDistributionType
       with typings.electronOsxSign.distEsmTypesMod.SigningDistributionType
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait distribution
    extends StObject
       with SigningDistributionType
       with typings.electronOsxSign.distEsmTypesMod.SigningDistributionType
  inline def distribution: distribution = "distribution".asInstanceOf[distribution]
  
  @js.native
  sealed trait mas
    extends StObject
       with ElectronMacPlatform
       with typings.electronOsxSign.distEsmTypesMod.ElectronMacPlatform
  inline def mas: mas = "mas".asInstanceOf[mas]
}
