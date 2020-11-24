package typings.gitconfiglocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GitConfig = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type callback = js.Function2[
    /* error */ typings.std.Error | typings.gitconfiglocal.gitconfiglocalBooleans.`false`, 
    /* config */ typings.gitconfiglocal.mod.GitConfig, 
    scala.Unit
  ]
}
