package typings.gitDiffParser

import typings.gitDiffParser.gitDiffParserBooleans.`false`
import typings.gitDiffParser.gitDiffParserBooleans.`true`
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): Result = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Result]
  inline def apply(input: Buffer): Result = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("git-diff-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Commit extends StObject {
    
    var files: js.Array[File]
  }
  object Commit {
    
    inline def apply(files: js.Array[File]): Commit = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commit]
    }
    
    extension [Self <: Commit](x: Self) {
      
      inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  trait DetailedCommit
    extends StObject
       with Commit {
    
    var author: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[Date] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var sha: js.UndefOr[String] = js.undefined
  }
  object DetailedCommit {
    
    inline def apply(files: js.Array[File]): DetailedCommit = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedCommit]
    }
    
    extension [Self <: DetailedCommit](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    }
  }
  
  trait DetailedResult
    extends StObject
       with Result {
    
    @JSName("commits")
    var commits_DetailedResult: js.Array[DetailedCommit]
    
    @JSName("detailed")
    var detailed_DetailedResult: `true`
  }
  object DetailedResult {
    
    inline def apply(commits: js.Array[DetailedCommit]): DetailedResult = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = true)
      __obj.asInstanceOf[DetailedResult]
    }
    
    extension [Self <: DetailedResult](x: Self) {
      
      inline def setCommits(value: js.Array[DetailedCommit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      inline def setCommitsVarargs(value: DetailedCommit*): Self = StObject.set(x, "commits", js.Array(value :_*))
      
      inline def setDetailed(value: `true`): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryResult
    extends StObject
       with Result {
    
    @JSName("detailed")
    var detailed_DryResult: `false`
  }
  object DryResult {
    
    inline def apply(commits: js.Array[Commit]): DryResult = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = false)
      __obj.asInstanceOf[DryResult]
    }
    
    extension [Self <: DryResult](x: Self) {
      
      inline def setDetailed(value: `false`): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var added: Boolean
    
    var binary: Boolean
    
    var deleted: Boolean
    
    var index: js.UndefOr[js.Array[String]] = js.undefined
    
    var lines: js.Array[Line]
    
    var name: String
    
    var oldName: js.UndefOr[String] = js.undefined
    
    var renamed: Boolean
  }
  object File {
    
    inline def apply(
      added: Boolean,
      binary: Boolean,
      deleted: Boolean,
      lines: js.Array[Line],
      name: String,
      renamed: Boolean
    ): File = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renamed = renamed.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setAdded(value: Boolean): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
      
      inline def setOldNameUndefined: Self = StObject.set(x, "oldName", js.undefined)
      
      inline def setRenamed(value: Boolean): Self = StObject.set(x, "renamed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Line extends StObject {
    
    /** Has line break. Always false for added failes */
    var break: Boolean
    
    /** The main line number */
    var ln1: Double
    
    /** New line number (for type normal) */
    var ln2: js.UndefOr[Double] = js.undefined
    
    /** Content of removed or added string */
    var text: String
    
    var `type`: LineType
  }
  object Line {
    
    inline def apply(break: Boolean, ln1: Double, text: String, `type`: LineType): Line = {
      val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], ln1 = ln1.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    extension [Self <: Line](x: Self) {
      
      inline def setBreak(value: Boolean): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
      
      inline def setLn1(value: Double): Self = StObject.set(x, "ln1", value.asInstanceOf[js.Any])
      
      inline def setLn2(value: Double): Self = StObject.set(x, "ln2", value.asInstanceOf[js.Any])
      
      inline def setLn2Undefined: Self = StObject.set(x, "ln2", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: LineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents prefix in `git diff` output: '+', '-', or space */
  /* Rewritten from type alias, can be one of: 
    - typings.gitDiffParser.gitDiffParserStrings.deleted
    - typings.gitDiffParser.gitDiffParserStrings.added
    - typings.gitDiffParser.gitDiffParserStrings.normal
  */
  trait LineType extends StObject
  object LineType {
    
    inline def added: typings.gitDiffParser.gitDiffParserStrings.added = "added".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.added]
    
    inline def deleted: typings.gitDiffParser.gitDiffParserStrings.deleted = "deleted".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.deleted]
    
    inline def normal: typings.gitDiffParser.gitDiffParserStrings.normal = "normal".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.normal]
  }
  
  trait Result extends StObject {
    
    var commits: js.Array[Commit]
    
    var detailed: Boolean
  }
  object Result {
    
    inline def apply(commits: js.Array[Commit], detailed: Boolean): Result = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setCommits(value: js.Array[Commit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      inline def setCommitsVarargs(value: Commit*): Self = StObject.set(x, "commits", js.Array(value :_*))
      
      inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    }
  }
}
