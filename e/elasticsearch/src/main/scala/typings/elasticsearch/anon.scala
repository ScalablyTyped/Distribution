package typings.elasticsearch

import typings.elasticsearch.mod.IndicesUpdateAliasesParamsAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actions extends StObject {
    
    var actions: js.Array[IndicesUpdateAliasesParamsAction]
  }
  object Actions {
    
    @scala.inline
    def apply(actions: js.Array[IndicesUpdateAliasesParamsAction]): Actions = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actions]
    }
    
    @scala.inline
    implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[IndicesUpdateAliasesParamsAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: IndicesUpdateAliasesParamsAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    }
  }
  
  trait Alias extends StObject {
    
    var alias: String
    
    var filter: js.UndefOr[js.Object] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    var indices: js.UndefOr[js.Array[String]] = js.undefined
    
    var routing: js.UndefOr[String] = js.undefined
  }
  object Alias {
    
    @scala.inline
    def apply(alias: String): Alias = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    @scala.inline
    implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: js.Object): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndices(value: js.Array[String]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      @scala.inline
      def setIndicesVarargs(value: String*): Self = StObject.set(x, "indices", js.Array(value :_*))
      
      @scala.inline
      def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    }
  }
  
  trait Bulk extends StObject {
    
    var bulk: Double
    
    var search: Double
  }
  object Bulk {
    
    @scala.inline
    def apply(bulk: Double, search: Double): Bulk = {
      val __obj = js.Dynamic.literal(bulk = bulk.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bulk]
    }
    
    @scala.inline
    implicit class BulkMutableBuilder[Self <: Bulk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBulk(value: Double): Self = StObject.set(x, "bulk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait Conflicts extends StObject {
    
    var conflicts: js.UndefOr[String] = js.undefined
    
    var dest: Optype
    
    var script: js.UndefOr[Inline] = js.undefined
    
    var source: Index
  }
  object Conflicts {
    
    @scala.inline
    def apply(dest: Optype, source: Index): Conflicts = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conflicts]
    }
    
    @scala.inline
    implicit class ConflictsMutableBuilder[Self <: Conflicts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConflicts(value: String): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
      
      @scala.inline
      def setDest(value: Optype): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: Inline): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setSource(value: Index): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Explanation[T] extends StObject {
    
    var _explanation: js.UndefOr[typings.elasticsearch.mod.Explanation] = js.undefined
    
    var _id: String
    
    var _index: String
    
    var _score: Double
    
    var _source: T
    
    var _type: String
    
    var _version: js.UndefOr[Double] = js.undefined
    
    var fields: js.UndefOr[js.Any] = js.undefined
    
    var highlight: js.UndefOr[js.Any] = js.undefined
    
    var inner_hits: js.UndefOr[js.Any] = js.undefined
    
    var matched_queries: js.UndefOr[js.Array[String]] = js.undefined
    
    var sort: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Explanation {
    
    @scala.inline
    def apply[T](_id: String, _index: String, _score: Double, _source: T, _type: String): Explanation[T] = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _score = _score.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explanation[T]]
    }
    
    @scala.inline
    implicit class ExplanationMutableBuilder[Self <: Explanation[?], T] (val x: Self & Explanation[T]) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setHighlight(value: js.Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setInner_hits(value: js.Any): Self = StObject.set(x, "inner_hits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInner_hitsUndefined: Self = StObject.set(x, "inner_hits", js.undefined)
      
      @scala.inline
      def setMatched_queries(value: js.Array[String]): Self = StObject.set(x, "matched_queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatched_queriesUndefined: Self = StObject.set(x, "matched_queries", js.undefined)
      
      @scala.inline
      def setMatched_queriesVarargs(value: String*): Self = StObject.set(x, "matched_queries", js.Array(value :_*))
      
      @scala.inline
      def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
      
      @scala.inline
      def set_explanation(value: typings.elasticsearch.mod.Explanation): Self = StObject.set(x, "_explanation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_explanationUndefined: Self = StObject.set(x, "_explanation", js.undefined)
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_score(value: Double): Self = StObject.set(x, "_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_source(value: T): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_version(value: Double): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
    }
  }
  
  trait Hits[T] extends StObject {
    
    var hits: js.Array[Explanation[T]]
    
    var max_score: Double
    
    var total: Double
  }
  object Hits {
    
    @scala.inline
    def apply[T](hits: js.Array[Explanation[T]], max_score: Double, total: Double): Hits[T] = {
      val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hits[T]]
    }
    
    @scala.inline
    implicit class HitsMutableBuilder[Self <: Hits[?], T] (val x: Self & Hits[T]) extends AnyVal {
      
      @scala.inline
      def setHits(value: js.Array[Explanation[T]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitsVarargs(value: Explanation[T]*): Self = StObject.set(x, "hits", js.Array(value :_*))
      
      @scala.inline
      def setMax_score(value: Double): Self = StObject.set(x, "max_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Host {
    
    @scala.inline
    def apply(host: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var index: String | js.Array[String]
    
    var query: js.UndefOr[js.Any] = js.undefined
    
    var remote: js.UndefOr[Host] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[js.Any] = js.undefined
    
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Index {
    
    @scala.inline
    def apply(index: String | js.Array[String]): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRemote(value: Host): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSort(value: js.Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  trait IndexString extends StObject {
    
    var index: String
  }
  object IndexString {
    
    @scala.inline
    def apply(index: String): IndexString = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexString]
    }
    
    @scala.inline
    implicit class IndexStringMutableBuilder[Self <: IndexString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Indices extends StObject {
    
    var alias: String
    
    var index: js.UndefOr[String] = js.undefined
    
    var indices: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Indices {
    
    @scala.inline
    def apply(alias: String): Indices = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indices]
    }
    
    @scala.inline
    implicit class IndicesMutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndices(value: js.Array[String]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      @scala.inline
      def setIndicesVarargs(value: String*): Self = StObject.set(x, "indices", js.Array(value :_*))
    }
  }
  
  trait Inline extends StObject {
    
    var `inline`: String
    
    var lang: String
  }
  object Inline {
    
    @scala.inline
    def apply(`inline`: String, lang: String): Inline = {
      val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inline]
    }
    
    @scala.inline
    implicit class InlineMutableBuilder[Self <: Inline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    }
  }
  
  trait Optype extends StObject {
    
    var index: String
    
    var op_type: js.UndefOr[String] = js.undefined
    
    var pipeline: js.UndefOr[String] = js.undefined
    
    var routing: js.UndefOr[String] = js.undefined
    
    var version_type: js.UndefOr[String] = js.undefined
  }
  object Optype {
    
    @scala.inline
    def apply(index: String): Optype = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optype]
    }
    
    @scala.inline
    implicit class OptypeMutableBuilder[Self <: Optype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp_type(value: String): Self = StObject.set(x, "op_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp_typeUndefined: Self = StObject.set(x, "op_type", js.undefined)
      
      @scala.inline
      def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
      
      @scala.inline
      def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
      
      @scala.inline
      def setVersion_type(value: String): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
    }
  }
}
