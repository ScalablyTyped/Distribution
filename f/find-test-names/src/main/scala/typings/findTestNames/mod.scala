package typings.findTestNames

import typings.findTestNames.anon.PendingTestCount
import typings.findTestNames.findTestNamesBooleans.`false`
import typings.findTestNames.findTestNamesBooleans.`true`
import typings.findTestNames.findTestNamesStrings.suite
import typings.findTestNames.findTestNamesStrings.test
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-test-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def countTags(structure: Structure): Record[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("countTags")(structure.asInstanceOf[js.Any]).asInstanceOf[Record[String, Double]]
  
  inline def countTests(structure: Structure): PendingTestCount = ^.asInstanceOf[js.Dynamic].applyDynamic("countTests")(structure.asInstanceOf[js.Any]).asInstanceOf[PendingTestCount]
  
  inline def filterByEffectiveTags(structure: String, tags: js.Array[String]): js.Array[Test] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterByEffectiveTags")(structure.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Array[Test]]
  inline def filterByEffectiveTags(structure: Structure, tags: js.Array[String]): js.Array[Test] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterByEffectiveTags")(structure.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Array[Test]]
  
  inline def findEffectiveTestTags(source: String): Record[String, Tags] = ^.asInstanceOf[js.Dynamic].applyDynamic("findEffectiveTestTags")(source.asInstanceOf[js.Any]).asInstanceOf[Record[String, Tags]]
  
  inline def findEffectiveTestTagsIn(specFilename: String): ReturnType[js.Function1[/* source */ String, Record[String, Tags]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findEffectiveTestTagsIn")(specFilename.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* source */ String, Record[String, Tags]]]]
  
  inline def formatTestList(tests: js.Array[Test | Suite]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestList")(tests.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatTestList(tests: js.Array[Test | Suite], indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestList")(tests.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTestNames(source: String): Results = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestNames")(source.asInstanceOf[js.Any]).asInstanceOf[Results]
  
  inline def getTestNames_false(source: String, withStructure: `false`): Results = (^.asInstanceOf[js.Dynamic].applyDynamic("getTestNames")(source.asInstanceOf[js.Any], withStructure.asInstanceOf[js.Any])).asInstanceOf[Results]
  
  inline def getTestNames_true(source: String, withStructure: `true`): ResultsWithStructure = (^.asInstanceOf[js.Dynamic].applyDynamic("getTestNames")(source.asInstanceOf[js.Any], withStructure.asInstanceOf[js.Any])).asInstanceOf[ResultsWithStructure]
  
  inline def setEffectiveTags(structure: Structure): Structure = ^.asInstanceOf[js.Dynamic].applyDynamic("setEffectiveTags")(structure.asInstanceOf[js.Any]).asInstanceOf[Structure]
  
  inline def setParentSuite(structure: Structure): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setParentSuite")(structure.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def visitEachNode(structure: Structure, fn: VisitCallback, parentSuite: Suite): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachNode")(structure.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], parentSuite.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def visitEachTest(structure: Structure, fn: VisitCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachTest")(structure.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visitEachTest(structure: Structure, fn: VisitCallback, parentSuite: Suite): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachTest")(structure.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], parentSuite.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Results extends StObject {
    
    var suiteNames: js.Array[String]
    
    var testNames: js.Array[String]
    
    var tests: js.Array[TestInfo | SuiteInfo]
  }
  object Results {
    
    inline def apply(suiteNames: js.Array[String], testNames: js.Array[String], tests: js.Array[TestInfo | SuiteInfo]): Results = {
      val __obj = js.Dynamic.literal(suiteNames = suiteNames.asInstanceOf[js.Any], testNames = testNames.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      inline def setSuiteNames(value: js.Array[String]): Self = StObject.set(x, "suiteNames", value.asInstanceOf[js.Any])
      
      inline def setSuiteNamesVarargs(value: String*): Self = StObject.set(x, "suiteNames", js.Array(value*))
      
      inline def setTestNames(value: js.Array[String]): Self = StObject.set(x, "testNames", value.asInstanceOf[js.Any])
      
      inline def setTestNamesVarargs(value: String*): Self = StObject.set(x, "testNames", js.Array(value*))
      
      inline def setTests(value: js.Array[TestInfo | SuiteInfo]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: (TestInfo | SuiteInfo)*): Self = StObject.set(x, "tests", js.Array(value*))
    }
  }
  
  trait ResultsWithStructure
    extends StObject
       with Results {
    
    var pendingTestCount: Double
    
    var structure: Structure
    
    var testCount: Double
  }
  object ResultsWithStructure {
    
    inline def apply(
      pendingTestCount: Double,
      structure: Structure,
      suiteNames: js.Array[String],
      testCount: Double,
      testNames: js.Array[String],
      tests: js.Array[TestInfo | SuiteInfo]
    ): ResultsWithStructure = {
      val __obj = js.Dynamic.literal(pendingTestCount = pendingTestCount.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], suiteNames = suiteNames.asInstanceOf[js.Any], testCount = testCount.asInstanceOf[js.Any], testNames = testNames.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultsWithStructure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultsWithStructure] (val x: Self) extends AnyVal {
      
      inline def setPendingTestCount(value: Double): Self = StObject.set(x, "pendingTestCount", value.asInstanceOf[js.Any])
      
      inline def setStructure(value: Structure): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
      
      inline def setStructureVarargs(value: (Suite | Test)*): Self = StObject.set(x, "structure", js.Array(value*))
      
      inline def setTestCount(value: Double): Self = StObject.set(x, "testCount", value.asInstanceOf[js.Any])
    }
  }
  
  type Structure = js.Array[Suite | Test]
  
  trait Suite extends StObject {
    
    var name: String
    
    var pending: Boolean
    
    var requiredTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var suiteCount: Double
    
    var suites: js.Array[Suite]
    
    var tags: js.UndefOr[Tags] = js.undefined
    
    var testCount: Double
    
    var tests: js.Array[Test]
    
    var `type`: suite
  }
  object Suite {
    
    inline def apply(
      name: String,
      pending: Boolean,
      suiteCount: Double,
      suites: js.Array[Suite],
      testCount: Double,
      tests: js.Array[Test]
    ): Suite = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], suiteCount = suiteCount.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], testCount = testCount.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("suite")
      __obj.asInstanceOf[Suite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Suite] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setRequiredTags(value: js.Array[String]): Self = StObject.set(x, "requiredTags", value.asInstanceOf[js.Any])
      
      inline def setRequiredTagsUndefined: Self = StObject.set(x, "requiredTags", js.undefined)
      
      inline def setRequiredTagsVarargs(value: String*): Self = StObject.set(x, "requiredTags", js.Array(value*))
      
      inline def setSuiteCount(value: Double): Self = StObject.set(x, "suiteCount", value.asInstanceOf[js.Any])
      
      inline def setSuites(value: js.Array[Suite]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      inline def setSuitesVarargs(value: Suite*): Self = StObject.set(x, "suites", js.Array(value*))
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTestCount(value: Double): Self = StObject.set(x, "testCount", value.asInstanceOf[js.Any])
      
      inline def setTests(value: js.Array[Test]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value*))
      
      inline def setType(value: suite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuiteDescribe extends StObject {
    
    var suite: Suite
    
    var suiteInfo: SuiteInfo
  }
  object SuiteDescribe {
    
    inline def apply(suite: Suite, suiteInfo: SuiteInfo): SuiteDescribe = {
      val __obj = js.Dynamic.literal(suite = suite.asInstanceOf[js.Any], suiteInfo = suiteInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuiteDescribe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuiteDescribe] (val x: Self) extends AnyVal {
      
      inline def setSuite(value: Suite): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteInfo(value: SuiteInfo): Self = StObject.set(x, "suiteInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuiteInfo extends StObject {
    
    var name: String
    
    var pending: Boolean
    
    var tags: js.UndefOr[Tags] = js.undefined
    
    var `type`: suite
  }
  object SuiteInfo {
    
    inline def apply(name: String, pending: Boolean): SuiteInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("suite")
      __obj.asInstanceOf[SuiteInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuiteInfo] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setType(value: suite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Tags = js.Array[String]
  
  trait Test extends StObject {
    
    var name: String
    
    var pending: Boolean
    
    var requiredTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var tags: Tags
    
    var `type`: test
  }
  object Test {
    
    inline def apply(name: String, pending: Boolean, tags: Tags): Test = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("test")
      __obj.asInstanceOf[Test]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setRequiredTags(value: js.Array[String]): Self = StObject.set(x, "requiredTags", value.asInstanceOf[js.Any])
      
      inline def setRequiredTagsUndefined: Self = StObject.set(x, "requiredTags", js.undefined)
      
      inline def setRequiredTagsVarargs(value: String*): Self = StObject.set(x, "requiredTags", js.Array(value*))
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setType(value: test): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestDescribe extends StObject {
    
    var test: Test
    
    var testInfo: TestInfo
  }
  object TestDescribe {
    
    inline def apply(test: Test, testInfo: TestInfo): TestDescribe = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], testInfo = testInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestDescribe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestDescribe] (val x: Self) extends AnyVal {
      
      inline def setTest(value: Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestInfo(value: TestInfo): Self = StObject.set(x, "testInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestInfo extends StObject {
    
    var name: String
    
    var pending: Boolean
    
    var tags: js.UndefOr[Tags] = js.undefined
    
    var `type`: test
  }
  object TestInfo {
    
    inline def apply(name: String, pending: Boolean): TestInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("test")
      __obj.asInstanceOf[TestInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestInfo] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setType(value: test): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type VisitCallback = js.Function2[/* test */ Test | Suite, /* parentSuite */ js.UndefOr[Suite], Unit]
}
