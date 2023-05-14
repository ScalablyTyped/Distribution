organization := "org.scalablytyped"
name := "firebase__auth-compat"
version := "0.4.2-98ea34"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.9.10-0aacb8",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.2.0-34a08c",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.2.10-b47aac",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-8ac2f2",
  "org.scalablytyped" %%% "firebase__auth" % "0.23.2-94bdb9",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.2.1-1c5f49",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.12.0-eea3ea",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-b93592",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-5ce190",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-ed4cef",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20230429Z-65c886",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-6a0345")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
