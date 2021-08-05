package typings.genericFunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generic-functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endswithdot(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("endswithdot")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def icstrcmp(str1: String, str2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("icstrcmp")(str1.asInstanceOf[js.Any], str2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def icstrendswith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("icstrendswith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def objGetKeyByValue(`object`: js.Object, value: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("objGetKeyByValue")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def println(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("println")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printlns(message: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printlns")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def strcmp(str1: String, str2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strcmp")(str1.asInstanceOf[js.Any], str2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def strendswith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strendswith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
