package typings.eggMock

import typings.eggMock.mod.EnvType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eggMockStrings {
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def prod: prod = "prod".asInstanceOf[prod]
  
  @scala.inline
  def test: test = "test".asInstanceOf[test]
  
  @scala.inline
  def unittest: unittest = "unittest".asInstanceOf[unittest]
  
  @js.native
  sealed trait default extends EnvType
  
  @js.native
  sealed trait local extends EnvType
  
  @js.native
  sealed trait prod extends EnvType
  
  @js.native
  sealed trait test extends EnvType
  
  @js.native
  sealed trait unittest extends EnvType
}
