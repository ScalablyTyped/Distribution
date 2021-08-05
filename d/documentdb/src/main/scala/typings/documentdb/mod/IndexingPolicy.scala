package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexingPolicy extends StObject {
  
  /** Represents the paths to be excluded from indexing. */
  var ExcludedPaths: js.Array[ExcludedPath]
  
  /** Represents the paths to be included for indexing. */
  var IncludedPaths: js.Array[IncludedPath]
  
  /** Specifies whether automatic indexing is enabled for a collection. */
  var automatic: Boolean
  
  /** The indexing mode (consistent or lazy) {@link IndexingMode}. */
  var indexingMode: IndexingMode
}
object IndexingPolicy {
  
  inline def apply(
    ExcludedPaths: js.Array[ExcludedPath],
    IncludedPaths: js.Array[IncludedPath],
    automatic: Boolean,
    indexingMode: IndexingMode
  ): IndexingPolicy = {
    val __obj = js.Dynamic.literal(ExcludedPaths = ExcludedPaths.asInstanceOf[js.Any], IncludedPaths = IncludedPaths.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], indexingMode = indexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexingPolicy]
  }
  
  extension [Self <: IndexingPolicy](x: Self) {
    
    inline def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setExcludedPaths(value: js.Array[ExcludedPath]): Self = StObject.set(x, "ExcludedPaths", value.asInstanceOf[js.Any])
    
    inline def setExcludedPathsVarargs(value: ExcludedPath*): Self = StObject.set(x, "ExcludedPaths", js.Array(value :_*))
    
    inline def setIncludedPaths(value: js.Array[IncludedPath]): Self = StObject.set(x, "IncludedPaths", value.asInstanceOf[js.Any])
    
    inline def setIncludedPathsVarargs(value: IncludedPath*): Self = StObject.set(x, "IncludedPaths", js.Array(value :_*))
    
    inline def setIndexingMode(value: IndexingMode): Self = StObject.set(x, "indexingMode", value.asInstanceOf[js.Any])
  }
}
