package typings.gitParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitCommitTypeMod {
  
  trait FileModification extends StObject {
    
    var linesAdded: js.UndefOr[Double] = js.undefined
    
    var linesDeleted: js.UndefOr[Double] = js.undefined
    
    var path: String
  }
  object FileModification {
    
    inline def apply(path: String): FileModification = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileModification]
    }
    
    extension [Self <: FileModification](x: Self) {
      
      inline def setLinesAdded(value: Double): Self = StObject.set(x, "linesAdded", value.asInstanceOf[js.Any])
      
      inline def setLinesAddedUndefined: Self = StObject.set(x, "linesAdded", js.undefined)
      
      inline def setLinesDeleted(value: Double): Self = StObject.set(x, "linesDeleted", value.asInstanceOf[js.Any])
      
      inline def setLinesDeletedUndefined: Self = StObject.set(x, "linesDeleted", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileRename extends StObject {
    
    var newPath: String
    
    var oldPath: String
  }
  object FileRename {
    
    inline def apply(newPath: String, oldPath: String): FileRename = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileRename]
    }
    
    extension [Self <: FileRename](x: Self) {
      
      inline def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitCommit extends StObject {
    
    var authorEmail: String
    
    var authorName: String
    
    var date: String
    
    var filesAdded: js.Array[FileModification]
    
    var filesDeleted: js.Array[FileModification]
    
    var filesModified: js.Array[FileModification]
    
    var filesRenamed: js.Array[FileRename]
    
    var hash: String
    
    var message: String
  }
  object GitCommit {
    
    inline def apply(
      authorEmail: String,
      authorName: String,
      date: String,
      filesAdded: js.Array[FileModification],
      filesDeleted: js.Array[FileModification],
      filesModified: js.Array[FileModification],
      filesRenamed: js.Array[FileRename],
      hash: String,
      message: String
    ): GitCommit = {
      val __obj = js.Dynamic.literal(authorEmail = authorEmail.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesDeleted = filesDeleted.asInstanceOf[js.Any], filesModified = filesModified.asInstanceOf[js.Any], filesRenamed = filesRenamed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommit]
    }
    
    extension [Self <: GitCommit](x: Self) {
      
      inline def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
      
      inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFilesAdded(value: js.Array[FileModification]): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
      
      inline def setFilesAddedVarargs(value: FileModification*): Self = StObject.set(x, "filesAdded", js.Array(value*))
      
      inline def setFilesDeleted(value: js.Array[FileModification]): Self = StObject.set(x, "filesDeleted", value.asInstanceOf[js.Any])
      
      inline def setFilesDeletedVarargs(value: FileModification*): Self = StObject.set(x, "filesDeleted", js.Array(value*))
      
      inline def setFilesModified(value: js.Array[FileModification]): Self = StObject.set(x, "filesModified", value.asInstanceOf[js.Any])
      
      inline def setFilesModifiedVarargs(value: FileModification*): Self = StObject.set(x, "filesModified", js.Array(value*))
      
      inline def setFilesRenamed(value: js.Array[FileRename]): Self = StObject.set(x, "filesRenamed", value.asInstanceOf[js.Any])
      
      inline def setFilesRenamedVarargs(value: FileRename*): Self = StObject.set(x, "filesRenamed", js.Array(value*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
