package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatSegmentsSegmentsRecord extends StObject {
  
  var committed: js.UndefOr[String] = js.undefined
  
  var compound: js.UndefOr[String] = js.undefined
  
  var dc: js.UndefOr[String] = js.undefined
  
  var dd: js.UndefOr[String] = js.undefined
  
  var docsCount: js.UndefOr[String] = js.undefined
  
  var docsDeleted: js.UndefOr[String] = js.undefined
  
  @JSName("docs.count")
  var docsDotcount: js.UndefOr[String] = js.undefined
  
  @JSName("docs.deleted")
  var docsDotdeleted: js.UndefOr[String] = js.undefined
  
  var g: js.UndefOr[String] = js.undefined
  
  var gen: js.UndefOr[String] = js.undefined
  
  var generation: js.UndefOr[String] = js.undefined
  
  var i: js.UndefOr[IndexName] = js.undefined
  
  var ic: js.UndefOr[String] = js.undefined
  
  var ico: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[NodeId] = js.undefined
  
  var idx: js.UndefOr[IndexName] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var ip: js.UndefOr[String] = js.undefined
  
  var is: js.UndefOr[String] = js.undefined
  
  var isCommitted: js.UndefOr[String] = js.undefined
  
  var isCompound: js.UndefOr[String] = js.undefined
  
  var isSearchable: js.UndefOr[String] = js.undefined
  
  var p: js.UndefOr[String] = js.undefined
  
  var pr: js.UndefOr[String] = js.undefined
  
  var primaryOrReplica: js.UndefOr[String] = js.undefined
  
  var prirep: js.UndefOr[String] = js.undefined
  
  var s: js.UndefOr[String] = js.undefined
  
  var searchable: js.UndefOr[String] = js.undefined
  
  var seg: js.UndefOr[String] = js.undefined
  
  var segment: js.UndefOr[String] = js.undefined
  
  var sh: js.UndefOr[String] = js.undefined
  
  var shard: js.UndefOr[String] = js.undefined
  
  var si: js.UndefOr[ByteSize] = js.undefined
  
  var size: js.UndefOr[ByteSize] = js.undefined
  
  @JSName("size.memory")
  var sizeDotmemory: js.UndefOr[ByteSize] = js.undefined
  
  var sizeMemory: js.UndefOr[ByteSize] = js.undefined
  
  var sm: js.UndefOr[ByteSize] = js.undefined
  
  var v: js.UndefOr[VersionString] = js.undefined
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object CatSegmentsSegmentsRecord {
  
  inline def apply(): CatSegmentsSegmentsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatSegmentsSegmentsRecord]
  }
  
  extension [Self <: CatSegmentsSegmentsRecord](x: Self) {
    
    inline def setCommitted(value: String): Self = StObject.set(x, "committed", value.asInstanceOf[js.Any])
    
    inline def setCommittedUndefined: Self = StObject.set(x, "committed", js.undefined)
    
    inline def setCompound(value: String): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
    
    inline def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
    
    inline def setDc(value: String): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    inline def setDcUndefined: Self = StObject.set(x, "dc", js.undefined)
    
    inline def setDd(value: String): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
    
    inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
    
    inline def setDocsCount(value: String): Self = StObject.set(x, "docsCount", value.asInstanceOf[js.Any])
    
    inline def setDocsCountUndefined: Self = StObject.set(x, "docsCount", js.undefined)
    
    inline def setDocsDeleted(value: String): Self = StObject.set(x, "docsDeleted", value.asInstanceOf[js.Any])
    
    inline def setDocsDeletedUndefined: Self = StObject.set(x, "docsDeleted", js.undefined)
    
    inline def setDocsDotcount(value: String): Self = StObject.set(x, "docs.count", value.asInstanceOf[js.Any])
    
    inline def setDocsDotcountUndefined: Self = StObject.set(x, "docs.count", js.undefined)
    
    inline def setDocsDotdeleted(value: String): Self = StObject.set(x, "docs.deleted", value.asInstanceOf[js.Any])
    
    inline def setDocsDotdeletedUndefined: Self = StObject.set(x, "docs.deleted", js.undefined)
    
    inline def setG(value: String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
    
    inline def setGen(value: String): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    inline def setGenUndefined: Self = StObject.set(x, "gen", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setI(value: IndexName): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    
    inline def setIc(value: String): Self = StObject.set(x, "ic", value.asInstanceOf[js.Any])
    
    inline def setIcUndefined: Self = StObject.set(x, "ic", js.undefined)
    
    inline def setIco(value: String): Self = StObject.set(x, "ico", value.asInstanceOf[js.Any])
    
    inline def setIcoUndefined: Self = StObject.set(x, "ico", js.undefined)
    
    inline def setId(value: NodeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdx(value: IndexName): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsCommitted(value: String): Self = StObject.set(x, "isCommitted", value.asInstanceOf[js.Any])
    
    inline def setIsCommittedUndefined: Self = StObject.set(x, "isCommitted", js.undefined)
    
    inline def setIsCompound(value: String): Self = StObject.set(x, "isCompound", value.asInstanceOf[js.Any])
    
    inline def setIsCompoundUndefined: Self = StObject.set(x, "isCompound", js.undefined)
    
    inline def setIsSearchable(value: String): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
    
    inline def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setPrimaryOrReplica(value: String): Self = StObject.set(x, "primaryOrReplica", value.asInstanceOf[js.Any])
    
    inline def setPrimaryOrReplicaUndefined: Self = StObject.set(x, "primaryOrReplica", js.undefined)
    
    inline def setPrirep(value: String): Self = StObject.set(x, "prirep", value.asInstanceOf[js.Any])
    
    inline def setPrirepUndefined: Self = StObject.set(x, "prirep", js.undefined)
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSearchable(value: String): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setSeg(value: String): Self = StObject.set(x, "seg", value.asInstanceOf[js.Any])
    
    inline def setSegUndefined: Self = StObject.set(x, "seg", js.undefined)
    
    inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setSh(value: String): Self = StObject.set(x, "sh", value.asInstanceOf[js.Any])
    
    inline def setShUndefined: Self = StObject.set(x, "sh", js.undefined)
    
    inline def setShard(value: String): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
    
    inline def setSi(value: ByteSize): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
    
    inline def setSiUndefined: Self = StObject.set(x, "si", js.undefined)
    
    inline def setSize(value: ByteSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeDotmemory(value: ByteSize): Self = StObject.set(x, "size.memory", value.asInstanceOf[js.Any])
    
    inline def setSizeDotmemoryUndefined: Self = StObject.set(x, "size.memory", js.undefined)
    
    inline def setSizeMemory(value: ByteSize): Self = StObject.set(x, "sizeMemory", value.asInstanceOf[js.Any])
    
    inline def setSizeMemoryUndefined: Self = StObject.set(x, "sizeMemory", js.undefined)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSm(value: ByteSize): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
    
    inline def setV(value: VersionString): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
