package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQueryBreakdown extends StObject {
  
  var advance: long
  
  var advance_count: long
  
  var build_scorer: long
  
  var build_scorer_count: long
  
  var compute_max_score: long
  
  var compute_max_score_count: long
  
  var create_weight: long
  
  var create_weight_count: long
  
  var `match`: long
  
  var match_count: long
  
  var next_doc: long
  
  var next_doc_count: long
  
  var score: long
  
  var score_count: long
  
  var set_min_competitive_score: long
  
  var set_min_competitive_score_count: long
  
  var shallow_advance: long
  
  var shallow_advance_count: long
}
object SearchQueryBreakdown {
  
  inline def apply(
    advance: long,
    advance_count: long,
    build_scorer: long,
    build_scorer_count: long,
    compute_max_score: long,
    compute_max_score_count: long,
    create_weight: long,
    create_weight_count: long,
    `match`: long,
    match_count: long,
    next_doc: long,
    next_doc_count: long,
    score: long,
    score_count: long,
    set_min_competitive_score: long,
    set_min_competitive_score_count: long,
    shallow_advance: long,
    shallow_advance_count: long
  ): SearchQueryBreakdown = {
    val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], advance_count = advance_count.asInstanceOf[js.Any], build_scorer = build_scorer.asInstanceOf[js.Any], build_scorer_count = build_scorer_count.asInstanceOf[js.Any], compute_max_score = compute_max_score.asInstanceOf[js.Any], compute_max_score_count = compute_max_score_count.asInstanceOf[js.Any], create_weight = create_weight.asInstanceOf[js.Any], create_weight_count = create_weight_count.asInstanceOf[js.Any], match_count = match_count.asInstanceOf[js.Any], next_doc = next_doc.asInstanceOf[js.Any], next_doc_count = next_doc_count.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], score_count = score_count.asInstanceOf[js.Any], set_min_competitive_score = set_min_competitive_score.asInstanceOf[js.Any], set_min_competitive_score_count = set_min_competitive_score_count.asInstanceOf[js.Any], shallow_advance = shallow_advance.asInstanceOf[js.Any], shallow_advance_count = shallow_advance_count.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryBreakdown]
  }
  
  extension [Self <: SearchQueryBreakdown](x: Self) {
    
    inline def setAdvance(value: long): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
    
    inline def setAdvance_count(value: long): Self = StObject.set(x, "advance_count", value.asInstanceOf[js.Any])
    
    inline def setBuild_scorer(value: long): Self = StObject.set(x, "build_scorer", value.asInstanceOf[js.Any])
    
    inline def setBuild_scorer_count(value: long): Self = StObject.set(x, "build_scorer_count", value.asInstanceOf[js.Any])
    
    inline def setCompute_max_score(value: long): Self = StObject.set(x, "compute_max_score", value.asInstanceOf[js.Any])
    
    inline def setCompute_max_score_count(value: long): Self = StObject.set(x, "compute_max_score_count", value.asInstanceOf[js.Any])
    
    inline def setCreate_weight(value: long): Self = StObject.set(x, "create_weight", value.asInstanceOf[js.Any])
    
    inline def setCreate_weight_count(value: long): Self = StObject.set(x, "create_weight_count", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: long): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatch_count(value: long): Self = StObject.set(x, "match_count", value.asInstanceOf[js.Any])
    
    inline def setNext_doc(value: long): Self = StObject.set(x, "next_doc", value.asInstanceOf[js.Any])
    
    inline def setNext_doc_count(value: long): Self = StObject.set(x, "next_doc_count", value.asInstanceOf[js.Any])
    
    inline def setScore(value: long): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScore_count(value: long): Self = StObject.set(x, "score_count", value.asInstanceOf[js.Any])
    
    inline def setSet_min_competitive_score(value: long): Self = StObject.set(x, "set_min_competitive_score", value.asInstanceOf[js.Any])
    
    inline def setSet_min_competitive_score_count(value: long): Self = StObject.set(x, "set_min_competitive_score_count", value.asInstanceOf[js.Any])
    
    inline def setShallow_advance(value: long): Self = StObject.set(x, "shallow_advance", value.asInstanceOf[js.Any])
    
    inline def setShallow_advance_count(value: long): Self = StObject.set(x, "shallow_advance_count", value.asInstanceOf[js.Any])
  }
}
