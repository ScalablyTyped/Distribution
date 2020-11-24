package typings.gliderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EasingFunction = js.Function5[
    /* x */ scala.Double, 
    /* t */ scala.Double, 
    /* b */ scala.Double, 
    /* c */ scala.Double, 
    /* d */ scala.Double, 
    scala.Double
  ]
  
  // Selectors are either results of querying document DOM or a string
  // Let's default to nullable Element to allow friction free migration
  // from JS to TS
  type Selector = typings.gliderJs.mod.global.Element | java.lang.String
}
