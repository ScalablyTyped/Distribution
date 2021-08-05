package typings.eggMock

import typings.eggMock.mod.EnvType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eggMockStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with EnvType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait local
    extends StObject
       with EnvType
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait prod
    extends StObject
       with EnvType
  inline def prod: prod = "prod".asInstanceOf[prod]
  
  @js.native
  sealed trait test
    extends StObject
       with EnvType
  inline def test: test = "test".asInstanceOf[test]
  
  @js.native
  sealed trait unittest
    extends StObject
       with EnvType
  inline def unittest: unittest = "unittest".asInstanceOf[unittest]
}
