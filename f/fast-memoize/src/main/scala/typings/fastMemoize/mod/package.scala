package typings.fastMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CacheCreateFunc[K, V] = js.Function0[typings.fastMemoize.anon.Get[K, V]]
  
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  
  type MemoizeFunc = js.Function2[
    /* fn */ typings.fastMemoize.mod.Func, 
    /* options */ js.UndefOr[typings.fastMemoize.mod.Options[typings.fastMemoize.mod.Func]], 
    typings.fastMemoize.mod.Func
  ]
  
  type Serializer = js.Function1[/* args */ js.Array[js.Any], java.lang.String]
}
