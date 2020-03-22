package typings.egg

import typings.egg.mod._EggEnvType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eggStrings {
  @js.native
  sealed trait `ALLOW-FROM` extends js.Object
  
  @js.native
  sealed trait DENY extends js.Object
  
  @js.native
  sealed trait PowerPartial extends js.Object
  
  @js.native
  sealed trait SAMEORIGIN extends js.Object
  
  @js.native
  sealed trait app extends js.Object
  
  @js.native
  sealed trait ctx extends js.Object
  
  @js.native
  sealed trait duplicate extends js.Object
  
  @js.native
  sealed trait ignore extends js.Object
  
  @js.native
  sealed trait local extends _EggEnvType
  
  @js.native
  sealed trait prod extends _EggEnvType
  
  @js.native
  sealed trait redirect extends js.Object
  
  @js.native
  sealed trait unittest extends _EggEnvType
  
  @scala.inline
  def `ALLOW-FROM`: `ALLOW-FROM` = "ALLOW-FROM".asInstanceOf[`ALLOW-FROM`]
  @scala.inline
  def DENY: DENY = "DENY".asInstanceOf[DENY]
  @scala.inline
  def PowerPartial: PowerPartial = "PowerPartial".asInstanceOf[PowerPartial]
  @scala.inline
  def SAMEORIGIN: SAMEORIGIN = "SAMEORIGIN".asInstanceOf[SAMEORIGIN]
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  @scala.inline
  def ctx: ctx = "ctx".asInstanceOf[ctx]
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def prod: prod = "prod".asInstanceOf[prod]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  @scala.inline
  def unittest: unittest = "unittest".asInstanceOf[unittest]
}

