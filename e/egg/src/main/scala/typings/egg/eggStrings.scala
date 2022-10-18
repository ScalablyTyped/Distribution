package typings.egg

import typings.egg.mod._EggEnvType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eggStrings {
  
  @js.native
  sealed trait `ALLOW-FROM` extends StObject
  inline def `ALLOW-FROM`: `ALLOW-FROM` = "ALLOW-FROM".asInstanceOf[`ALLOW-FROM`]
  
  @js.native
  sealed trait DENY extends StObject
  inline def DENY: DENY = "DENY".asInstanceOf[DENY]
  
  @js.native
  sealed trait SAMEORIGIN extends StObject
  inline def SAMEORIGIN: SAMEORIGIN = "SAMEORIGIN".asInstanceOf[SAMEORIGIN]
  
  @js.native
  sealed trait app extends StObject
  inline def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait ctx extends StObject
  inline def ctx: ctx = "ctx".asInstanceOf[ctx]
  
  @js.native
  sealed trait duplicate extends StObject
  inline def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait local
    extends StObject
       with _EggEnvType
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait prod
    extends StObject
       with _EggEnvType
  inline def prod: prod = "prod".asInstanceOf[prod]
  
  @js.native
  sealed trait redirect extends StObject
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait unittest
    extends StObject
       with _EggEnvType
  inline def unittest: unittest = "unittest".asInstanceOf[unittest]
}
