package typings.googleDashAppsDashScript.GoogleAppsScript.JDBC

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC database metadata object. For documentation of this class, see
  * java.sql.DatabaseMetaData.
  */
@js.native
trait JdbcDatabaseMetaData extends js.Object {
  def allProceduresAreCallable(): Boolean = js.native
  def allTablesAreSelectable(): Boolean = js.native
  def autoCommitFailureClosesAllResultSets(): Boolean = js.native
  def dataDefinitionCausesTransactionCommit(): Boolean = js.native
  def dataDefinitionIgnoredInTransactions(): Boolean = js.native
  def deletesAreDetected(`type`: Integer): Boolean = js.native
  def doesMaxRowSizeIncludeBlobs(): Boolean = js.native
  def getAttributes(catalog: String, schemaPattern: String, typeNamePattern: String, attributeNamePattern: String): JdbcResultSet = js.native
  def getBestRowIdentifier(catalog: String, schema: String, table: String, scope: Integer, nullable: Boolean): JdbcResultSet = js.native
  def getCatalogSeparator(): String = js.native
  def getCatalogTerm(): String = js.native
  def getCatalogs(): JdbcResultSet = js.native
  def getClientInfoProperties(): JdbcResultSet = js.native
  def getColumnPrivileges(catalog: String, schema: String, table: String, columnNamePattern: String): JdbcResultSet = js.native
  def getColumns(catalog: String, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): JdbcResultSet = js.native
  def getConnection(): JdbcConnection = js.native
  def getCrossReference(
    parentCatalog: String,
    parentSchema: String,
    parentTable: String,
    foreignCatalog: String,
    foreignSchema: String,
    foreignTable: String
  ): JdbcResultSet = js.native
  def getDatabaseMajorVersion(): Integer = js.native
  def getDatabaseMinorVersion(): Integer = js.native
  def getDatabaseProductName(): String = js.native
  def getDatabaseProductVersion(): String = js.native
  def getDefaultTransactionIsolation(): Integer = js.native
  def getDriverMajorVersion(): Integer = js.native
  def getDriverMinorVersion(): Integer = js.native
  def getDriverName(): String = js.native
  def getDriverVersion(): String = js.native
  def getExportedKeys(catalog: String, schema: String, table: String): JdbcResultSet = js.native
  def getExtraNameCharacters(): String = js.native
  def getFunctionColumns(catalog: String, schemaPattern: String, functionNamePattern: String, columnNamePattern: String): JdbcResultSet = js.native
  def getFunctions(catalog: String, schemaPattern: String, functionNamePattern: String): JdbcResultSet = js.native
  def getIdentifierQuoteString(): String = js.native
  def getImportedKeys(catalog: String, schema: String, table: String): JdbcResultSet = js.native
  def getIndexInfo(catalog: String, schema: String, table: String, unique: Boolean, approximate: Boolean): JdbcResultSet = js.native
  def getJDBCMajorVersion(): Integer = js.native
  def getJDBCMinorVersion(): Integer = js.native
  def getMaxBinaryLiteralLength(): Integer = js.native
  def getMaxCatalogNameLength(): Integer = js.native
  def getMaxCharLiteralLength(): Integer = js.native
  def getMaxColumnNameLength(): Integer = js.native
  def getMaxColumnsInGroupBy(): Integer = js.native
  def getMaxColumnsInIndex(): Integer = js.native
  def getMaxColumnsInOrderBy(): Integer = js.native
  def getMaxColumnsInSelect(): Integer = js.native
  def getMaxColumnsInTable(): Integer = js.native
  def getMaxConnections(): Integer = js.native
  def getMaxCursorNameLength(): Integer = js.native
  def getMaxIndexLength(): Integer = js.native
  def getMaxProcedureNameLength(): Integer = js.native
  def getMaxRowSize(): Integer = js.native
  def getMaxSchemaNameLength(): Integer = js.native
  def getMaxStatementLength(): Integer = js.native
  def getMaxStatements(): Integer = js.native
  def getMaxTableNameLength(): Integer = js.native
  def getMaxTablesInSelect(): Integer = js.native
  def getMaxUserNameLength(): Integer = js.native
  def getNumericFunctions(): String = js.native
  def getPrimaryKeys(catalog: String, schema: String, table: String): JdbcResultSet = js.native
  def getProcedureColumns(catalog: String, schemaPattern: String, procedureNamePattern: String, columnNamePattern: String): JdbcResultSet = js.native
  def getProcedureTerm(): String = js.native
  def getProcedures(catalog: String, schemaPattern: String, procedureNamePattern: String): JdbcResultSet = js.native
  def getResultSetHoldability(): Integer = js.native
  def getRowIdLifetime(): Integer = js.native
  def getSQLKeywords(): String = js.native
  def getSQLStateType(): Integer = js.native
  def getSchemaTerm(): String = js.native
  def getSchemas(): JdbcResultSet = js.native
  def getSchemas(catalog: String, schemaPattern: String): JdbcResultSet = js.native
  def getSearchStringEscape(): String = js.native
  def getStringFunctions(): String = js.native
  def getSuperTables(catalog: String, schemaPattern: String, tableNamePattern: String): JdbcResultSet = js.native
  def getSuperTypes(catalog: String, schemaPattern: String, typeNamePattern: String): JdbcResultSet = js.native
  def getSystemFunctions(): String = js.native
  def getTablePrivileges(catalog: String, schemaPattern: String, tableNamePattern: String): JdbcResultSet = js.native
  def getTableTypes(): JdbcResultSet = js.native
  def getTables(catalog: String, schemaPattern: String, tableNamePattern: String, types: js.Array[String]): JdbcResultSet = js.native
  def getTimeDateFunctions(): String = js.native
  def getTypeInfo(): JdbcResultSet = js.native
  def getUDTs(catalog: String, schemaPattern: String, typeNamePattern: String, types: js.Array[Integer]): JdbcResultSet = js.native
  def getURL(): String = js.native
  def getUserName(): String = js.native
  def getVersionColumns(catalog: String, schema: String, table: String): JdbcResultSet = js.native
  def insertsAreDetected(`type`: Integer): Boolean = js.native
  def isCatalogAtStart(): Boolean = js.native
  def isReadOnly(): Boolean = js.native
  def locatorsUpdateCopy(): Boolean = js.native
  def nullPlusNonNullIsNull(): Boolean = js.native
  def nullsAreSortedAtEnd(): Boolean = js.native
  def nullsAreSortedAtStart(): Boolean = js.native
  def nullsAreSortedHigh(): Boolean = js.native
  def nullsAreSortedLow(): Boolean = js.native
  def othersDeletesAreVisible(`type`: Integer): Boolean = js.native
  def othersInsertsAreVisible(`type`: Integer): Boolean = js.native
  def othersUpdatesAreVisible(`type`: Integer): Boolean = js.native
  def ownDeletesAreVisible(`type`: Integer): Boolean = js.native
  def ownInsertsAreVisible(`type`: Integer): Boolean = js.native
  def ownUpdatesAreVisible(`type`: Integer): Boolean = js.native
  def storesLowerCaseIdentifiers(): Boolean = js.native
  def storesLowerCaseQuotedIdentifiers(): Boolean = js.native
  def storesMixedCaseIdentifiers(): Boolean = js.native
  def storesMixedCaseQuotedIdentifiers(): Boolean = js.native
  def storesUpperCaseIdentifiers(): Boolean = js.native
  def storesUpperCaseQuotedIdentifiers(): Boolean = js.native
  def supportsANSI92EntryLevelSQL(): Boolean = js.native
  def supportsANSI92FullSQL(): Boolean = js.native
  def supportsANSI92IntermediateSQL(): Boolean = js.native
  def supportsAlterTableWithAddColumn(): Boolean = js.native
  def supportsAlterTableWithDropColumn(): Boolean = js.native
  def supportsBatchUpdates(): Boolean = js.native
  def supportsCatalogsInDataManipulation(): Boolean = js.native
  def supportsCatalogsInIndexDefinitions(): Boolean = js.native
  def supportsCatalogsInPrivilegeDefinitions(): Boolean = js.native
  def supportsCatalogsInProcedureCalls(): Boolean = js.native
  def supportsCatalogsInTableDefinitions(): Boolean = js.native
  def supportsColumnAliasing(): Boolean = js.native
  def supportsConvert(): Boolean = js.native
  def supportsConvert(fromType: Integer, toType: Integer): Boolean = js.native
  def supportsCoreSQLGrammar(): Boolean = js.native
  def supportsCorrelatedSubqueries(): Boolean = js.native
  def supportsDataDefinitionAndDataManipulationTransactions(): Boolean = js.native
  def supportsDataManipulationTransactionsOnly(): Boolean = js.native
  def supportsDifferentTableCorrelationNames(): Boolean = js.native
  def supportsExpressionsInOrderBy(): Boolean = js.native
  def supportsExtendedSQLGrammar(): Boolean = js.native
  def supportsFullOuterJoins(): Boolean = js.native
  def supportsGetGeneratedKeys(): Boolean = js.native
  def supportsGroupBy(): Boolean = js.native
  def supportsGroupByBeyondSelect(): Boolean = js.native
  def supportsGroupByUnrelated(): Boolean = js.native
  def supportsIntegrityEnhancementFacility(): Boolean = js.native
  def supportsLikeEscapeClause(): Boolean = js.native
  def supportsLimitedOuterJoins(): Boolean = js.native
  def supportsMinimumSQLGrammar(): Boolean = js.native
  def supportsMixedCaseIdentifiers(): Boolean = js.native
  def supportsMixedCaseQuotedIdentifiers(): Boolean = js.native
  def supportsMultipleOpenResults(): Boolean = js.native
  def supportsMultipleResultSets(): Boolean = js.native
  def supportsMultipleTransactions(): Boolean = js.native
  def supportsNamedParameters(): Boolean = js.native
  def supportsNonNullableColumns(): Boolean = js.native
  def supportsOpenCursorsAcrossCommit(): Boolean = js.native
  def supportsOpenCursorsAcrossRollback(): Boolean = js.native
  def supportsOpenStatementsAcrossCommit(): Boolean = js.native
  def supportsOpenStatementsAcrossRollback(): Boolean = js.native
  def supportsOrderByUnrelated(): Boolean = js.native
  def supportsOuterJoins(): Boolean = js.native
  def supportsPositionedDelete(): Boolean = js.native
  def supportsPositionedUpdate(): Boolean = js.native
  def supportsResultSetConcurrency(`type`: Integer, concurrency: Integer): Boolean = js.native
  def supportsResultSetHoldability(holdability: Integer): Boolean = js.native
  def supportsResultSetType(`type`: Integer): Boolean = js.native
  def supportsSavepoints(): Boolean = js.native
  def supportsSchemasInDataManipulation(): Boolean = js.native
  def supportsSchemasInIndexDefinitions(): Boolean = js.native
  def supportsSchemasInPrivilegeDefinitions(): Boolean = js.native
  def supportsSchemasInProcedureCalls(): Boolean = js.native
  def supportsSchemasInTableDefinitions(): Boolean = js.native
  def supportsSelectForUpdate(): Boolean = js.native
  def supportsStatementPooling(): Boolean = js.native
  def supportsStoredFunctionsUsingCallSyntax(): Boolean = js.native
  def supportsStoredProcedures(): Boolean = js.native
  def supportsSubqueriesInComparisons(): Boolean = js.native
  def supportsSubqueriesInExists(): Boolean = js.native
  def supportsSubqueriesInIns(): Boolean = js.native
  def supportsSubqueriesInQuantifieds(): Boolean = js.native
  def supportsTableCorrelationNames(): Boolean = js.native
  def supportsTransactionIsolationLevel(level: Integer): Boolean = js.native
  def supportsTransactions(): Boolean = js.native
  def supportsUnion(): Boolean = js.native
  def supportsUnionAll(): Boolean = js.native
  def updatesAreDetected(`type`: Integer): Boolean = js.native
  def usesLocalFilePerTable(): Boolean = js.native
  def usesLocalFiles(): Boolean = js.native
}

