package typings.domNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domNavigationStrings {
  
  @js.native
  sealed trait `after-transition` extends StObject
  inline def `after-transition`: `after-transition` = "after-transition".asInstanceOf[`after-transition`]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait currententrychange extends StObject
  inline def currententrychange: currententrychange = "currententrychange".asInstanceOf[currententrychange]
  
  @js.native
  sealed trait dispose extends StObject
  inline def dispose: dispose = "dispose".asInstanceOf[dispose]
  
  @js.native
  sealed trait manual extends StObject
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait navigate extends StObject
  inline def navigate: navigate = "navigate".asInstanceOf[navigate]
  
  @js.native
  sealed trait navigateerror extends StObject
  inline def navigateerror: navigateerror = "navigateerror".asInstanceOf[navigateerror]
  
  @js.native
  sealed trait navigatesuccess extends StObject
  inline def navigatesuccess: navigatesuccess = "navigatesuccess".asInstanceOf[navigatesuccess]
  
  @js.native
  sealed trait push
    extends StObject
       with NavigationTypeString
  inline def push: push = "push".asInstanceOf[push]
  
  @js.native
  sealed trait reload
    extends StObject
       with NavigationTypeString
  inline def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait replace
    extends StObject
       with NavigationTypeString
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait traverse
    extends StObject
       with NavigationTypeString
  inline def traverse: traverse = "traverse".asInstanceOf[traverse]
}
