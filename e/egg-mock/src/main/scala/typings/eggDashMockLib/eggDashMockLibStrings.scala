package typings
package eggDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eggDashMockLibStrings {
  @js.native
  sealed trait default
    extends eggDashMockLib.eggDashMockMod.EnvType
  
  @js.native
  sealed trait local
    extends eggDashMockLib.eggDashMockMod.EnvType
  
  @js.native
  sealed trait prod
    extends eggDashMockLib.eggDashMockMod.EnvType
  
  @js.native
  sealed trait test
    extends eggDashMockLib.eggDashMockMod.EnvType
  
  @js.native
  sealed trait unittest
    extends eggDashMockLib.eggDashMockMod.EnvType
  
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
}

